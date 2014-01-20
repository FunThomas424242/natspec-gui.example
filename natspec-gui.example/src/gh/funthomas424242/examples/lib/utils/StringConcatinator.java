package gh.funthomas424242.examples.lib.utils;

import java.util.List;

public class StringConcatinator {
	
	final List<String> tokens;
	
	public StringConcatinator(List<String> tokens){
		this.tokens=tokens;
	}
	
	public String getString(){
		final StringBuilder builder = new StringBuilder(tokens.size());
		for (String token : this.tokens) {
			builder.append(" "+token);
		}
		return builder.toString();
	}

}
