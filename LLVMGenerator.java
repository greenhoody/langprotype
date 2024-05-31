import java.util.Stack;

class LLVMGenerator{
   
   static String header_text = "";
   static String main_text = "";
   //text of function in one place to add complete function to header at the same time
   static String buffer = "";
   static int main_reg = 1;
   static int reg = 1;
   static int br = 0;

   static Stack<Integer> brstack = new Stack<Integer>();

   static void call(String id, String type){
      buffer += "%"+reg+" = call "+type+" @"+id+"()\n";
      reg++;
   }

   static void functionstart(String data_type,String id){
      main_text += buffer;
      main_reg = reg;
      buffer = "define "+data_type+" @"+id+"() nounwind {\n";
      reg = 1;
   }

   static void functionend(String data_type){
      buffer += "ret "+ data_type +" %"+(reg-1)+"\n";
      buffer += "}\n";
      header_text += buffer;
      buffer = "";
      reg = main_reg;
   }

   static void loopstart(String repetitions){
     
      declare_i32("%" + Integer.toString(reg), false);
      
      int counter = reg;
      reg++;
      
      assign_i32("%" + Integer.toString(counter), "0");
      br++;
      buffer += "br label %cond"+br+"\n";
      buffer += "cond"+br+":\n";
      
      load_i32("%" + Integer.toString(counter));
      
      add_i32("%"+(reg-1), "1");

      assign_i32("%" + Integer.toString(counter), "%"+(reg-1));
 
      buffer += "%"+reg+" = icmp slt i32 %"+(reg-2)+", "+repetitions+"\n";
      reg++;
 
      buffer += "br i1 %"+(reg-1)+", label %true"+br+", label %false"+br+"\n";
      buffer += "true"+br+":\n";
      
      brstack.push(br);
    }
 
    static void loopend(){
      int b = brstack.pop();
      buffer += "br label %cond"+b+"\n";
      buffer += "false"+b+":\n";
    }

   static void ifstart(){
     br++;
     buffer += "br i1 %"+(reg-1)+", label %true"+br+", label %false"+br+"\n";
     buffer += "true"+br+":\n";
     brstack.push(br);
   }

   static void ifend(){
     int b = brstack.pop();
     buffer += "br label %false"+b+"\n";
     buffer += "false"+b+":\n";
   }

   static void printf_i32(String id){
      int tmp = load_i32(id);
      buffer += "%"+reg+" = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %"+(reg-1)+")\n";
      reg++;
   }

   static void printf_double(String id){
      int tmp = load_double(id);
      buffer += "%"+reg+" = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpd, i32 0, i32 0), double %"+(reg-1)+")\n";
      reg++;
   }

   static void printf_bool(String id){
      int tmp = load_bool(id);
      buffer += "%"+reg+" = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpb, i32 0, i32 0), i1 %"+(reg-1)+")\n";
      reg++;
   }

   static void printf_float(String id){
       load_float(id);
      
      buffer += "%" + reg + " = fpext float %" + (reg-1) + " to double\n";  // Extend float to double
      reg++;
      buffer += "%" + reg + " = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpd, i32 0, i32 0), double %" + (reg-1) + ")\n";
      reg++;
    }

   static void declare_i32(String id, Boolean global){
   if( global ){
         header_text += id+" = global i32 0\n";
      } else {
	 buffer += id+" = alloca i32\n";
      }
   }

   static void declare_double(String id, Boolean global){
      if( global ){
         header_text += id+" = global double 0.0\n";
      } else {
	 buffer += id+" = alloca double\n";
      }
   }

   static void declare_float(String id, Boolean global){
      if( global ){
         header_text += id+" = global float 0.0\n";
      } else {
	 buffer += id+" = alloca float\n";
      }
   }

   static void declare_bool(String id, Boolean global){
      if( global ){
         header_text += id+" = global i1 0\n";
      } else {
	  buffer += id+" = alloca i1\n";
      }
   }


   static void assign_i32(String id, String value){
      buffer += "store i32 "+value+", i32* "+id+"\n";
   }

   static void assign_double(String id, String value){
      buffer += "store double "+value+", double* "+id+"\n";
   }

   static void assign_float(String id, String value){

   
      if(   value.substring(value.length()-1,value.length()).equals("f")   ){
         value = value.substring(0, value.length() - 1);
         float floatValue = Float.parseFloat(value);
         value = String.valueOf((double) floatValue);
      }
      
      
        buffer += "store float "+value+", float* "+id+"\n";
     }


   static void assign_bool(String id, String value){
      buffer += "store i1 "+value+", i1* "+id+"\n";
   }


   static int load_i32(String id){
      buffer += "%"+reg+" = load i32, i32* "+id+"\n";
      reg++;
      return reg - 1;
   }

   static int load_double(String id){
      buffer += "%"+reg+" = load double, double* "+id+"\n";
      reg++;
      return reg - 1;
   }

   static int load_float(String id){
      buffer += "%"+reg+" = load float, float* "+id+"\n";
      reg++;
      return reg - 1;
   }

   static int load_bool(String id){
      buffer += "%"+reg+" = load i1, i1*"+id+"\n";
      reg++;
      return reg - 1;
   }

   static void and(String val1, String val2){
      buffer += "%"+reg+" = and i1 "+val1+", "+val2+"\n";
      reg++;
   }

   static void or(String val1, String val2){
      buffer += "%"+reg+" = or i1 "+val1+", "+val2+"\n";
      reg++;
   }

   static void xor(String val1, String val2){
      buffer += "%"+reg+" = xor i1 "+val1+", "+val2+"\n";
      reg++;
   }

   static void neg(String val1){
      buffer += "%" + reg + " = xor i1 " + val1 + ", 1\n";
      reg++;
   }

   static void add_i32(String val1, String val2){
      buffer += "%"+reg+" = add i32 "+val1+", "+val2+"\n";
      reg++;
   }

   static void add_double(String val1, String val2){
      buffer += "%"+reg+" = fadd double "+val1+", "+val2+"\n";
      reg++;
   }

   static void add_float(String val1, String val2){
      buffer += "%"+reg+" = fadd float "+val1+", "+val2+"\n";
      reg++;
   }

   static void sub_i32(String val1, String val2){
      buffer += "%"+reg+" = sub i32 "+val1+", "+val2+"\n";
      reg++;
   }

   static void sub_double(String val1, String val2){
      buffer += "%"+reg+" = fsub double "+val1+", "+val2+"\n";
      reg++;
   }
   static void sub_float(String val1, String val2){
      buffer += "%"+reg+" = fsub float "+val1+", "+val2+"\n";
      reg++;
   }

   static void mult_i32(String val1, String val2){
      buffer += "%"+reg+" = mul i32 "+val1+", "+val2+"\n";
      reg++;
   }

   static void mult_double(String val1, String val2){
      buffer += "%"+reg+" = fmul double "+val1+", "+val2+"\n";
      reg++;
   }

   static void mult_float(String val1, String val2){
      buffer += "%"+reg+" = fmul float "+val1+", "+val2+"\n";
      reg++;
   }

   static void div_i32(String val1, String val2){
      buffer += "%"+reg+" = sdiv i32 "+val1+", "+val2+"\n";
      reg++;
   }

   static void div_double(String val1, String val2){
      buffer += "%"+reg+" = fdiv double "+val1+", "+val2+"\n";
      reg++;
   }

   static void div_float(String val1, String val2){
      buffer += "%"+reg+" = fdiv float "+val1+", "+val2+"\n";
      reg++;
   }

   static void sitofp(String id){
      buffer += "%"+reg+" = sitofp i32 "+id+" to double\n";
      reg++;
   }

   static void fptosi(String id){
      buffer += "%"+reg+" = fptosi double "+id+" to i32\n";
      reg++;
   }

   static void scanInt(String id){
      buffer += "%"+reg+" = call i32 (i8*, ...) @__isoc99_scanf(i8* getelementptr inbounds ([3 x i8], [3 x i8]* @strs, i32 0, i32 0), i32* "+id+")\n";
      reg++;
   }


    static void scanReal(String id) {
        buffer += "%"+reg+" = call i32 (i8*, ...) @__isoc99_scanf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strsd, i32 0, i32 0), double* "+id+")\n";
        reg++;
    }

    static void scanF(String id) {
      buffer += "%" + reg + " = call i32 (i8*, ...) @__isoc99_scanf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpd, i32 0, i32 0), float* %" + id + ")\n";
   
      reg++;
   }

   static void close_main(){
      main_text += buffer;
   }


   static String generate(){
      String text = "";
      text += "declare i32 @printf(i8*, ...)\n";
      text += "declare i32 @__isoc99_scanf(i8*, ...)\n";
      text += "@strpi = constant [4 x i8] c\"%d\\0A\\00\"\n";
      text += "@strpd = constant [4 x i8] c\"%f\\0A\\00\"\n";
      //text += "@strpb = constant [4 x i8] c\"%i1\\0A\\00\"\n";
      text += "@strpb = constant [4 x i8] c\"%b\\0A\\00\"\n";
      text += "@strps = constant [4 x i8] c\"%s\\0A\\00\"\n";
      text += "@strsd = constant [4 x i8] c\"%lf\\00\"\n";
      text += "@strs = constant [3 x i8] c\"%d\\00\"\n";
      text += header_text;
      text += "define i32 @main() nounwind{\n";
      text += main_text;
      text += "ret i32 0 }\n";
      return text;
   }

}
