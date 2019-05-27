package Generics;

class MessageImp1<S> implements Imessage<S>{
    @Override
    public String echo(S s) {
        return "ECHO"+s;
    }
}
