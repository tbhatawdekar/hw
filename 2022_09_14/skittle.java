// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
    
    
    	int fig_size = 3;
    
        for (int i=1; i<=fig_size; i++){
            // i will 1, 2, 3
            String s = "";
            
            // Let add the right number of indents
            // in the first iteration - we need to indent 2 times
            // in the second iteration - we need to indent 1 time
            // in the third iteration - we need to indent 0 times
            
            for (int indent_index = (fig_size - i); indent_index > 0; indent_index--){
                // in the first iteration indent_index will be 3 - i; i's value is 1 in the 
                // first iteration - so intent_index will be 3 - 1 or 2. 
                // in the second iteration indent_index will be 3 - 2 = 1 (because i's value will be 2)
                // in the third iteration indent_index will be 3-2 = 0
                s = " " + s; // space space, space, nothing ""
            }
            
            for (int backslash_index=1; backslash_index<=i; backslash_index++){
                s = s+ "\\";
            }
            for (int fwdslash_index=1; fwdslash_index<=i; fwdslash_index++){
                s = s + "/";
            }
            System.out.println(s);

        }
        
        
        for (int i=fig_size; i >0; i--){
        	String s = "";
            
            
            
            for (int fwdslash_index=1; fwdslash_index<=i; fwdslash_index++){
                s = s + "/";
            }
            
            for (int backslash_index=1; backslash_index<=i; backslash_index++){
                s = s+ "\\";
            }
            
            // no_space, 1 space, 2 spaces
            for (int intent_index = 0; intent_index < (fig_size - i); intent_index ++){
            	s = " " + s;
            }
            
            
            System.out.println(s);
        }
        
        
    }
}