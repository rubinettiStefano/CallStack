package com.generation.model;

public class Main 
{
    public static void main(String[] args) 
    {
        Person p = new Person();
        impostaProprietaControllando("id",p);
        impostaProprietaControllando("nome",p);
    }

    private static void impostaProprietaControllando(String nomeProp,Person ogg)
    {
        boolean isCorrect= false;
        do 
        {
            try 
            {
                System.out.println("Inserisci valore di "+nomeProp);
                String in = term.nextLine();
                
                switch (nomeProp) {
                    case "id":
                        ogg.setId(Integer.parseInt(in));
                    break;
                    case "nome":
                        ogg.setName(in);
                    break;
                
                    default:
                        break;
                }

                isCorrect = true;
            } 
            catch (Exception e) 
            {
                System.out.println("Il valore di "+nomeProp+"non è valido");
            }    
        } while (isCorrect);

    }
}
