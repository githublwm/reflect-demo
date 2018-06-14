package entity;

/**
 *
 * @author longwm
 */
public interface ChangeDataService<T> {
    Boolean doChange(T entity);

    ChangeConfig getChangeConfig();
}
