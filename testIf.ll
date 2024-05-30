declare i32 @printf(i8*, ...)
declare i32 @__isoc99_scanf(i8*, ...)
@strpi = constant [4 x i8] c"%d\0A\00"
@strpd = constant [4 x i8] c"%f\0A\00"
@strpb = constant [4 x i8] c"%b\0A\00"
@strps = constant [4 x i8] c"%s\0A\00"
@strsd = constant [4 x i8] c"%lf\00"
@strs = constant [3 x i8] c"%d\00"
@t = global i32 0
define double @nazwafunkcji() nounwind {
%cos = alloca double
store double 3.0, double* %cos
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
%6 = load double, double*%cos
%7 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpd, i32 0, i32 0), double %6)
%8 = load double, double*%cos
%9 = fadd double 1.0, %8
store double %9, double* %cos
br label %cond1
false1:
%10 = load double, double*%cos
%nazwafunkcji = alloca double
store double %10, double* %nazwafunkcji
%11 = load double, double*%nazwafunkcji
ret double %11
}
define double @funkcjadwa() nounwind {
%cos = alloca double
store double -3.0, double* %cos
%1 = load i32, i32* @t
%2 = alloca i32
store i32 0, i32* %2
br label %cond2
cond2:
%3 = load i32, i32* %2
%4 = add i32 %3, 1
store i32 %4, i32* %2
%5 = icmp slt i32 %3, %1
br i1 %5, label %true2, label %false2
true2:
%6 = load double, double*%cos
%7 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpd, i32 0, i32 0), double %6)
%8 = load double, double*%cos
%9 = fsub double %8, 1.0
store double %9, double* %cos
br label %cond2
false2:
%10 = load double, double*%cos
%funkcjadwa = alloca double
store double %10, double* %funkcjadwa
%11 = load double, double*%funkcjadwa
ret double %11
}
@g = global double 0.0
@f = global double 0.0
@x = global i32 0
@z = global i32 0
@y = global i1 0
define i32 @main() nounwind{
store i32 3, i32* @t
%1 = call double @funkcjadwa()
store double %1, double* @g
%2 = load double, double*@g
%3 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpd, i32 0, i32 0), double %2)
%4 = call double @nazwafunkcji()
store double %4, double* @f
%5 = load double, double*@f
%6 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpd, i32 0, i32 0), double %5)
store i32 5, i32* @x
store i32 3, i32* @z
store i32 7, i32* @z
store i1 true, i1* @y
%7 = load i1, i1*@y
br i1 %7, label %true3, label %false3
true3:
%8 = load i32, i32* @x
%9 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %8)
br label %false3
false3:
%10 = load i1, i1*@y
%11 = xor i1 %10, 1
br i1 %11, label %true4, label %false4
true4:
%12 = load i32, i32* @z
%13 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %12)
br label %false4
false4:
%14 = xor i1 true, false
br i1 %14, label %true5, label %false5
true5:
%15 = load i32, i32* @z
%16 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %15)
br label %false5
false5:
%17 = alloca i32
store i32 0, i32* %17
br label %cond6
cond6:
%18 = load i32, i32* %17
%19 = add i32 %18, 1
store i32 %19, i32* %17
%20 = icmp slt i32 %18, 2
br i1 %20, label %true6, label %false6
true6:
%21 = load i32, i32* @x
%22 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %21)
br label %cond6
false6:
ret i32 0 }

