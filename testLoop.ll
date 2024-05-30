declare i32 @printf(i8*, ...)
declare i32 @__isoc99_scanf(i8*, ...)
@strpi = constant [4 x i8] c"%d\0A\00"
@strpd = constant [4 x i8] c"%f\0A\00"
@strpb = constant [4 x i8] c"%b\0A\00"
@strps = constant [4 x i8] c"%s\0A\00"
@strsd = constant [4 x i8] c"%lf\00"
@strs = constant [3 x i8] c"%d\00"
@t = global i32 0
@cos = global double 0.0
define i32 @main() nounwind{
store i32 3, i32* @t
store double 3.0, double* @cos
%1 = load i32, i32* @t
%2 = alloca i32
store i32 0, i32* %2
br label %cond1
cond1:
%3 = load i32, i32* %2
%4 = add i32 %3, 1
store i32 %4, i32* %2
%5 = icmp slt i32 %3, %1
br i1 %5, label %true1, label %false1
true1:
%6 = load double, double*@cos
%7 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpd, i32 0, i32 0), double %6)
%8 = load double, double*@cos
%9 = fadd double 0.3, %8
store double %9, double* @cos
br label %cond1
false1:
%10 = load double, double*@cos
%11 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpd, i32 0, i32 0), double %10)
store double 2.0, double* @cos
%12 = alloca i32
store i32 0, i32* %12
br label %cond2
cond2:
%13 = load i32, i32* %12
%14 = add i32 %13, 1
store i32 %14, i32* %12
%15 = icmp slt i32 %13, 2
br i1 %15, label %true2, label %false2
true2:
%16 = load double, double*@cos
%17 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpd, i32 0, i32 0), double %16)
%18 = load double, double*@cos
%19 = fadd double 0.2, %18
store double %19, double* @cos
br label %cond2
false2:
%20 = load double, double*@cos
%21 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpd, i32 0, i32 0), double %20)
ret i32 0 }

