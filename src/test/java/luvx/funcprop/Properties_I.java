package luvx.funcprop;
import luvx.Self_I;
public interface Properties_I<I extends Properties_I<I>> extends Self_I<I>{
    Object get(String key);
    boolean containsKey(String key);
}
