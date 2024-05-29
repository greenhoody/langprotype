declare i32 @printf(i8*, ...)
declare i32 @__isoc99_scanf(i8*, ...)
@strpi = constant [4 x i8] c"%d\0A\00"
@strpd = constant [4 x i8] c"%f\0A\00"
@strpb = constant [4 x i8] c"%b\0A\00"
@strps = constant [4 x i8] c"%s\0A\00"
@strsd = constant [4 x i8] c"%lf\00"
@strs = constant [3 x i8] c"%d\00"
define i32 @main() nounwind{
%1 = mul i32 4, 3
%2 = add i32 %1, 2
%a = alloca i32
store i32 %2, i32* %a
%3 = load i32, i32* %a
%4 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %3)
%5 = load i32, i32* %a
%b = alloca i32
store i32 %5, i32* %b
%6 = load i32, i32* %b
%7 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %6)
%c = alloca i32
store i32 -2, i32* %c
%8 = load i32, i32* %a
%9 = sitofp i32 %8 to double
%10 = load i32, i32* %c
%11 = sitofp i32 %10 to double
%12 = fdiv double %9, %11
%d = alloca double
store double %12, double* %d
%13 = load double, double* %d
%14 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpd, i32 0, i32 0), double %13)
%e = alloca double
store double 3.0, double* %e
%g = alloca double
store double 13.0, double* %g
%15 = load double, double* %e
%16 = load double, double* %g
%17 = fadd double %16, %15
%18 = fdiv double %17, 2.0
%h = alloca double
store double %18, double* %h
%19 = load double, double* %h
%20 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpd, i32 0, i32 0), double %19)
%T = alloca i1
store i1 true, i1* %T
%21 = load i1, i1* %T
%22 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpb, i32 0, i32 0), i1 %21)
%23 = load i1, i1* %T
%24 = xor i1 %23, 1
%F = alloca i1
store i1 %24, i1* %F
%25 = load i1, i1* %F
%26 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpb, i32 0, i32 0), i1 %25)
%27 = load i1, i1* %T
%28 = load i1, i1* %F
%29 = and i1 %27, %28
%andtf = alloca i1
store i1 %29, i1* %andtf
%30 = load i1, i1* %andtf
%31 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpb, i32 0, i32 0), i1 %30)
%32 = load i1, i1* %T
%33 = load i1, i1* %T
%34 = and i1 %32, %33
%andtt = alloca i1
store i1 %34, i1* %andtt
%35 = load i1, i1* %andtt
%36 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpb, i32 0, i32 0), i1 %35)
%37 = load i1, i1* %T
%38 = load i1, i1* %F
%39 = xor i1 %37, %38
%xortf = alloca i1
store i1 %39, i1* %xortf
%40 = load i1, i1* %xortf
%41 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpb, i32 0, i32 0), i1 %40)
%42 = load i1, i1* %T
%43 = load i1, i1* %T
%44 = xor i1 %42, %43
%xortt = alloca i1
store i1 %44, i1* %xortt
%45 = load i1, i1* %xortt
%46 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpb, i32 0, i32 0), i1 %45)
%47 = load i1, i1* %T
%48 = load i1, i1* %F
%49 = or i1 %47, %48
%ortf = alloca i1
store i1 %49, i1* %ortf
%50 = load i1, i1* %ortf
%51 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpb, i32 0, i32 0), i1 %50)
%52 = load i1, i1* %F
%53 = load i1, i1* %F
%54 = or i1 %52, %53
%orff = alloca i1
store i1 %54, i1* %orff
%55 = load i1, i1* %orff
%56 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpb, i32 0, i32 0), i1 %55)
%y = alloca i32
store i32 0, i32* %y
%z = alloca i32
store i32 0, i32* %z
%57 = call i32 (i8*, ...) @__isoc99_scanf(i8* getelementptr inbounds ([3 x i8], [3 x i8]* @strs, i32 0, i32 0), i32* %y)
%58 = call i32 (i8*, ...) @__isoc99_scanf(i8* getelementptr inbounds ([3 x i8], [3 x i8]* @strs, i32 0, i32 0), i32* %z)
%59 = load i32, i32* %y
%60 = load i32, i32* %z
%61 = add i32 %60, %59
%x = alloca i32
store i32 %61, i32* %x
%62 = load i32, i32* %x
%63 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %62)
ret i32 0 }

