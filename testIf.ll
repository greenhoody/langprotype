declare i32 @printf(i8*, ...)
declare i32 @__isoc99_scanf(i8*, ...)
@strpi = constant [4 x i8] c"%d\0A\00"
@strpd = constant [4 x i8] c"%f\0A\00"
@strpb = constant [4 x i8] c"%b\0A\00"
@strps = constant [4 x i8] c"%s\0A\00"
@strsd = constant [4 x i8] c"%lf\00"
@strs = constant [3 x i8] c"%d\00"
@t = global i32 0
define i32 @nazwafunkcji() nounwind {
%1 = load i32, i32* @t
%2 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %1)
%null = alloca i32
store i32 0, i32* %null
%3 = load i32, i32* %null
ret i32 %3
}
@f = global i32 0
@x = global i32 0
@z = global i32 0
@y = global i1 0
define i32 @main() nounwind{
store i32 3, i32* @t
store i32 0, i32* @f
%1 = call i32 @nazwafunkcji()
store i32 %1, i32* @f
store i32 5, i32* @x
store i32 3, i32* @z
store i32 7, i32* @z
store i1 true, i1* @y
%2 = load i1, i1*@y
br i1 %2, label %true1, label %false1
true1:
%3 = load i32, i32* @x
%4 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %3)
br label %false1
false1:
%5 = load i1, i1*@y
%6 = xor i1 %5, 1
br i1 %6, label %true2, label %false2
true2:
%7 = load i32, i32* @z
%8 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %7)
br label %false2
false2:
%9 = xor i1 true, false
br i1 %9, label %true3, label %false3
true3:
%10 = load i32, i32* @z
%11 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %10)
br label %false3
false3:
%12 = alloca i32
store i32 0, i32* %12
br label %cond4
cond4:
%13 = load i32, i32* %12
%14 = add i32 %13, 1
store i32 %14, i32* %12
%15 = icmp slt i32 %13, 2
br i1 %15, label %true4, label %false4
true4:
%16 = load i32, i32* @x
%17 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %16)
br label %cond4
false4:
ret i32 0 }

