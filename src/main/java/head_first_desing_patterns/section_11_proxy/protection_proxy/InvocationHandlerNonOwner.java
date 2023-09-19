package head_first_desing_patterns.section_11_proxy.protection_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class InvocationHandlerNonOwner implements InvocationHandler {
    PersonComponent personComponent;

    public InvocationHandlerNonOwner(PersonComponent personComponent) {
        this.personComponent = personComponent;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] arguments) throws Throwable {
        try{
            if(method.getName().startsWith("get")){
                return method.invoke(personComponent, arguments);
            }else if (method.getName().startsWith("setBeautyRanking")){
                return method.invoke(personComponent,arguments);
            }else if(method.getName().startsWith("set")){
                throw new IllegalAccessException();
            }
        }catch (InvocationTargetException e){
            e.printStackTrace();
        }
        return null;
    }
}
