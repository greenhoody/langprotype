(prog (stat a  =  (boolexpr0 (boolexpr1 true)  &&  (boolexpr0 (boolexpr1 false)))) \n (stat b  =  (boolexpr0 (boolexpr1 true)  &&  (boolexpr0 (boolexpr1 true)))) \n (stat c  =  (boolexpr0 ! (boolexpr1 true))) \n (stat print  a) \n (stat print  b) \n (stat print  c) \n)
declare i32 @printf(i8*, ...)
declare i32 @__isoc99_scanf(i8*, ...)
@strpi = constant [4 x i8] c"%d\0A\00"
@strpd = constant [4 x i8] c"%f\0A\00"
@strpb = constant [4 x i8] c"%b\0A\00"
@strps = constant [4 x i8] c"%s\0A\00"
@strsd = constant [4 x i8] c"%lf\00"
@strs = constant [3 x i8] c"%d\00"
define i32 @main() nounwind{
%1 = and i1 true, false
%a = alloca i1
store i1 %1, i1* %a
%2 = and i1 true, true
%b = alloca i1
store i1 %2, i1* %b
%3 = xor i1 true, 1
%c = alloca i1
store i1 %3, i1* %c
%4 = load i1, i1* %a
%5 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpb, i32 0, i32 0), i1 %4)
%6 = load i1, i1* %b
%7 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpb, i32 0, i32 0), i1 %6)
%8 = load i1, i1* %c
%9 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpb, i32 0, i32 0), i1 %8)
ret i32 0 }

