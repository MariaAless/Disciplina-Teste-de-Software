package org.alessandra;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        if(args.length == 0){
            System.out.println("Uso: IdentifierMain <string>");
        } else {
            Identifier id = new Identifier();
            if(id.validateIdentifier(args[0])){
                System.out.print("Valido");
            } else {
                System.out.print("Invalido");
            }
        }
    }
}