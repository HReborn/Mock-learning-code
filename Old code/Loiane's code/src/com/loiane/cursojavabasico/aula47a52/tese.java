package com.loiane.cursojavabasico.aula47a52;

public class tese {
        

    public void metodo() {
        try
        {
            System.out.println("Caught inside fun().");
            throw new NullPointerException("demo");
            
        }
        catch(NullPointerException e)
        {
            
            throw e; // rethrowing the exception
        }
    }
}

