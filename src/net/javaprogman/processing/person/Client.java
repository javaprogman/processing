package net.javaprogman.processing.person;

import net.javaprogman.processing.paymentInstrument.Card;

import java.util.List;

public class Client extends Person {


    private Card card;



    Client(String firsName, String lastName, Card card){

        super(firsName, lastName);
        this.card = card;
    }

    public Card getCard() {
        return card;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
