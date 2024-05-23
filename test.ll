declare i32 @printf(i8*, ...)
declare i32 @__isoc99_scanf(i8*, ...)
@strpi = constant [4 x i8] c"%d\0A\00"
@strpd = constant [4 x i8] c"%f\0A\00"
@strpb = constant [4 x i8] c"%b\0A\00"
@strps = constant [4 x i8] c"%s\0A\00"
@strsd = constant [4 x i8] c"%lf\00"
@strs = constant [3 x i8] c"%d\00"
define i32 @main() nounwind{
%1 = xor i1 true, true
%e = alloca i1
store i1 %1, i1* %e
%2 = load i1, i1* %e
%3 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpb, i32 0, i32 0), i1 %2)
%4 = xor i1 false, false
%f = alloca i1
store i1 %4, i1* %f
%5 = load i1, i1* %f
%6 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpb, i32 0, i32 0), i1 %5)
%7 = xor i1 false, true
%g = alloca i1
store i1 %7, i1* %g
%8 = load i1, i1* %g
%9 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpb, i32 0, i32 0), i1 %8)
%10 = load i1, i1* %g
%11 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpb, i32 0, i32 0), i1 %10)
ret i32 0 }

