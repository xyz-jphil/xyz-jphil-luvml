package luvx.funcprop;

import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import luvx.Self_I;

public interface FuncMap_I<I extends FuncMap_I<I>> extends Self_I<I>{

    Map<String, Function<I, Object>> gettersFuncMap();

    default Optional<Object> valueOf(String key) {
        return Optional.of(gettersFuncMap().get(key))
                .map(f->f==null?null:f.apply(self()));
    }

    default Map<String, Optional<Object>> values() {
        return gettersFuncMap().entrySet()
            .stream()
            .collect(Collectors.toMap(
                Map.Entry::getKey,
                e -> Optional.of(
                    e.getValue()==null?null:e.getValue().apply(self()))
            )
        );
    }
}
