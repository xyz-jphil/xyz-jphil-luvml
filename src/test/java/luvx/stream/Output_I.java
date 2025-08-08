package luvx.stream;

public interface Output_I {
    Output_I __(String s);
    Output_I _c(char c);
    Output_I _i(int i);
    Output_I _d(double d);
    Output_I _z(boolean b);
    /**
     * inserts an end of statement which will mostly be a newline; using the term EOS to indicate generic nature, some compressed forms of streaming might skip newline for efficiency.
     * @return this
     */
    Output_I eos();
    
    Output_I child();
    Output_I parent();
    //Parameters parameters();
    
    <E> E getConfig(Class<E> clzz);
    
    Output_I _b(byte b);
    Output_I ba(byte[]b);
}
