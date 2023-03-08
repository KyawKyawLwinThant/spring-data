package com.example.democonnectionjdbc.aspect;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.sql.Connection;

public class ConnectionInvokationHandler implements InvocationHandler {
    private final Connection connection;

    public ConnectionInvokationHandler(Connection connection) {
        this.connection = connection;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Connection trace:"
                + method.toGenericString());
        return method.invoke(connection,args);
    }
}
