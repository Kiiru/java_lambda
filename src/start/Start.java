/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package start;

import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 *
 * @author tesla
 */
public class Start {
    
    public static void main(String[] args) {
        //
        Supplier<String> supplier = () -> "Hello!";
        System.out.println(supplier.get());
        Consumer<String> consumer = (String s) -> System.out.println(s);
        consumer.accept(supplier.get());
    }    
}
