package testLambda;
@FunctionalInterface
public interface IFunction<P,R> {
    public R change(P p);
}
