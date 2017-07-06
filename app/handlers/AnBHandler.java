package handlers;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import parsersLexers.ANBLexer;
import parsersLexers.ANBParser;

public class AnBHandler {
	
	String path = "";

	public void analizeFile(String everything){
		
		ANBLexer anblexer = new ANBLexer(CharStreams.fromString(everything));

		CommonTokenStream anbtokens = new CommonTokenStream(anblexer);

		ANBParser anbparser = new ANBParser(anbtokens);

		ParseTree tree = anbparser.anb_Protocol();

		System.out.println(tree.toStringTree(anbparser));
	}

	public String writeFile(String everything) {
		String output = "";
		
		ANBLexer anblexer = new ANBLexer(CharStreams.fromString(everything));

		CommonTokenStream anbtokens = new CommonTokenStream(anblexer);

		ANBParser anbparser = new ANBParser(anbtokens);

		ParseTree tree = anbparser.anb_Protocol();

		//System.out.println(tree.toStringTree(anbparser));	

		ParseTreeWalker anbwalker = new ParseTreeWalker();
		
		AnBwalker anblistener = new AnBwalker();
				
		anbwalker.walk(anblistener, tree);
		
		output = anblistener.newFile;
		
		return output;
	}

	public String openFile(String path) throws IOException {
		String everything = "";

		BufferedReader br = new BufferedReader(new FileReader(path));
		try {
			StringBuilder sb = new StringBuilder();
			String line = br.readLine();

			while (line != null) {
				sb.append(line);
				sb.append(System.lineSeparator());
				line = br.readLine();
			}
			everything = sb.toString();
		} finally {
			br.close();
		}
		
		return everything;
	}
	
	
}