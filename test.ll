declare i32 @printf(i8*, ...)
declare i32 @__isoc99_scanf(i8*, ...)
@strpi = constant [4 x i8] c"%d\0A\00"
@strpd = constant [4 x i8] c"%f\0A\00"
@strs = constant [3 x i8] c"%d\00"
define i32 @main() nounwind{
%a = alloca double
store double 2.1, double* %a
%1 = add i32 1, 1
%2 = sitofp i32 %1 to double
%3 = fmul double 2.1, %2
%x = alloca double
store double %3, double* %x
%4 = sdiv i32 4, 2
%b = alloca i32
store i32 %4, i32* %b
%5 = load i32, i32* %b
%6 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %5)
%7 = fsub double -4.0, -3.0
%c = alloca double
store double %7, double* %c
%8 = load double, double* %c
%9 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpd, i32 0, i32 0), double %8)
ret i32 0 }

