declare i32 @printf(i8*, ...)
declare i32 @__isoc99_scanf(i8*, ...)
@strpi = constant [4 x i8] c"%d\0A\00"
@strpd = constant [4 x i8] c"%f\0A\00"
@strpb = constant [4 x i8] c"%b\0A\00"
@strps = constant [4 x i8] c"%s\0A\00"
@strsd = constant [4 x i8] c"%lf\00"
@strs = constant [3 x i8] c"%d\00"
@a = global double 0.0
@b = global double 0.0
@odejmowanie = global double 0.0
@dodawanie = global double 0.0
@dzielenie = global double 0.0
@mnozenie = global double 0.0
@c = global i32 0
@zmianatypu = global double 0.0
define i32 @main() nounwind{
store double 2.0, double* @a
store double -3.0, double* @b
%1 = load double, double*@a
%2 = load double, double*@b
%3 = fsub double %1, %2
store double %3, double* @odejmowanie
%4 = load double, double*@odejmowanie
%5 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpd, i32 0, i32 0), double %4)
%6 = load double, double*@a
%7 = load double, double*@b
%8 = fadd double %7, %6
store double %8, double* @dodawanie
%9 = load double, double*@dodawanie
%10 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpd, i32 0, i32 0), double %9)
%11 = load double, double*@a
%12 = load double, double*@b
%13 = fdiv double %11, %12
store double %13, double* @dzielenie
%14 = load double, double*@dzielenie
%15 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpd, i32 0, i32 0), double %14)
%16 = load double, double*@a
%17 = load double, double*@b
%18 = fmul double %17, %16
store double %18, double* @mnozenie
%19 = load double, double*@mnozenie
%20 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpd, i32 0, i32 0), double %19)
store i32 10, i32* @c
%21 = load i32, i32* @c
%22 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %21)
%23 = load i32, i32* @c
%24 = sitofp i32 %23 to double
store double %24, double* @zmianatypu
%25 = load double, double*@zmianatypu
%26 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpd, i32 0, i32 0), double %25)
ret i32 0 }

