declare i32 @printf(i8*, ...)
declare i32 @__isoc99_scanf(i8*, ...)
@strpi = constant [4 x i8] c"%d\0A\00"
@strpd = constant [4 x i8] c"%f\0A\00"
@strpb = constant [4 x i8] c"%b\0A\00"
@strps = constant [4 x i8] c"%s\0A\00"
@strsd = constant [4 x i8] c"%lf\00"
@strs = constant [3 x i8] c"%d\00"
define i32 @main() nounwind{
%x = alloca i32
store i32 2, i32* %x
%1 = load i32, i32* %x
%2 = mul i32 2, %1
%3 = alloca i32
store i32 0, i32* %3
br label %cond1
cond1:
%4 = load i32, i32* %3
%5 = add i32 %4, 1
store i32 %5, i32* %3
%6 = icmp slt i32 %4, %2
br i1 %6, label %true1, label %false1
true1:
%7 = load i32, i32* %x
%8 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %7)
br label %cond1
false1:
ret i32 0 }

