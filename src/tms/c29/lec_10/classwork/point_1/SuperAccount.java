package tms.c29.lec_10.classwork.point_1;

public class SuperAccount<T, E, D extends Nationality, C> extends Account<T, E, D> {
    public SuperAccount(T id, E iban, D person) {
        super(id, iban, person);
    }
}
