declare i32 @printf(i8*, ...)
declare i32 @__isoc99_scanf(i8*, ...)
@strpi = constant [4 x i8] c"%d\0A\00"
@strpd = constant [4 x i8] c"%f\0A\00"
@strpb = constant [4 x i8] c"%b\0A\00"
@strps = constant [4 x i8] c"%s\0A\00"
@strsd = constant [4 x i8] c"%lf\00"
@strs = constant [3 x i8] c"%d\00"
define i32 @main() nounwind{
%a = alloca i32
store i32 2, i32* %a
%b = alloca i32
store i32 3, i32* %b
%1 = load i32, i32* %a
%2 = load i32, i32* %b
%3 = add i32 %2, %1
%4 = mul i32 3, %3
%5 = mul i32 2, %4
%c = alloca i32
store i32 %5, i32* %c
%6 = load i32, i32* %c
%7 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %6)
%8 = and i1 true, false
%9 = and i1 %8, true
%d = alloca i1
store i1 %9, i1* %d
%10 = load i1, i1* %d
%11 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpb, i32 0, i32 0), i1 %10)
%12 = and i1 true, true
%e = alloca i1
store i1 %12, i1* %e
%13 = load i1, i1* %e
%14 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpb, i32 0, i32 0), i1 %13)
ret i32 0 }

