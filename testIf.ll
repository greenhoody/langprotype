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
%1 = load i32, i32* %t
%2 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %1)
%nazwafunkcji = alloca i32
store i32 0, i32* %nazwafunkcji
%3 = load i32, i32* %nazwafunkcji
ret i32 %3
}
@x = global i32 0
@z = global i32 0
@y = global i1 0
define i32 @main() nounwind{
store i32 3, i32* @t
store i32 5, i32* @x
store i32 3, i32* @z
store i32 7, i32* @z
store i1 true, i1* @y
%1 = load i1, i1*@y
br i1 %1, label %true1, label %false1
true1:
%2 = load i32, i32* %x
%3 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %2)
br label %false1
false1:
%4 = load i1, i1*@y
%5 = xor i1 @4, 1
br i1 %5, label %true2, label %false2
true2:
%6 = load i32, i32* %z
%7 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %6)
br label %false2
false2:
%8 = xor i1 true, false
br i1 %8, label %true3, label %false3
true3:
%9 = load i32, i32* %z
%10 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %9)
br label %false3
false3:
11 = alloca i32
store i32 0, i32* 11
br label %cond4
cond4:
%12 = load i32, i32* 11
%13 = add i32 %12, 1
store i32 %13, i32* 11
%14 = icmp slt i32 %12, 2
br i1 %14, label %true4, label %false4
true4:
%15 = load i32, i32* %x
%16 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %15)
br label %cond4
false4:
ret i32 0 }

