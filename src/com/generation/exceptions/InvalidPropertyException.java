package com.generation.exceptions;

public class InvalidPropertyException extends RuntimeException 
{

    private String propName;
    private String objectName;


    //La classe che viene estesa viene detta SUPERCLASSE (o SUPERTIPO) - RuntimeException
    //La classe che estende viene detta SOTTOCLASSE (o SOTTOTIPO)      - InvalidPropertyException
    //Una SOTTOCLASSE può accedere alla sua SUPERCLASSE tramite super
    //super è simile a this, ma fa riferimento alla superclasse

    public InvalidPropertyException(String message, String propName, String objectName) 
    {

        super(message);//super(...) fa riferimento al COSTRUTTORE della Superclasse
        this.propName = propName;
        this.objectName = objectName;
    }

    public String generateNiceMessage()
    {
        String res = getMessage();
        res+=" sulla proprietà "+propName+" di un oggetto "+objectName;
        return res;  
    }

}
