package Lambda;
@FunctionalInterface//函数式接口
interface IFunction1<P,R> {
    public R change(P p);
}
@FunctionalInterface//函数式接口
interface IFunction2<R> {
    public R upper();
}
@FunctionalInterface//函数式接口
interface IFunction3<P> {
    public int compare(P p1,P p2);
}