// Intro to ANTLR+LLVM
// sawickib, 2014-2023


import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Main {
    public static void main(String[] args) throws Exception {
        CharStream input = CharStreams.fromFileName(args[0]);

        PleaseWorkLexer lexer = new PleaseWorkLexer(input);

        CommonTokenStream tokens = new CommonTokenStream(lexer);
        PleaseWorkParser parser = new PleaseWorkParser(tokens);

        ParseTree tree = parser.prog(); 

        //System.out.println(tree.toStringTree(parser));

        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new LLVMActions(), tree);

    }
}
