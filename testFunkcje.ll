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
%9 = fadd double 0.3, %8
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
define i1 @prawda() nounwind {
%prawda = alloca i1
store i1 true, i1* %prawda
%1 = load i1, i1*%prawda
ret i1 %1
}
define double @testowa() nounwind {
%cos = alloca double
store double 12.0, double* %cos
%h = alloca i32
store i32 -100, i32* %h
%1 = call double @funkcjadwa()
%bug = alloca double
store double %1, double* %bug
%2 = load i32, i32* %h
%3 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %2)
%4 = load double, double*%cos
%5 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpd, i32 0, i32 0), double %4)
%6 = load double, double*%cos
%7 = load double, double*%bug
%8 = fmul double %7, %6
%testowa = alloca double
store double %8, double* %testowa
%9 = load double, double*%testowa
ret double %9
}
@l = global double 0.0
@x = global i32 0
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
%7 = call double @testowa()
store double %7, double* @l
%8 = load double, double*@l
%9 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpd, i32 0, i32 0), double %8)
store i32 5, i32* @x
store i1 true, i1* @y
%10 = call i1 @prawda()
br i1 %10, label %true3, label %false3
true3:
%11 = load i32, i32* @x
%12 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %11)
br label %false3
false3:
ret i32 0 }

