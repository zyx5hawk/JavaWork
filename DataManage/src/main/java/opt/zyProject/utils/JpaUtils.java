package opt.zyProject.utils;

import java.util.function.Consumer;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JpaUtils {
	private static EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA");

	public static EntityManager createEM() {
		return factory.createEntityManager();
	}

	/**
	 * 不带事物的方法
	 * @param methodDgt
	 */
	public static Boolean ExecUnTran(Consumer<EntityManager> methodDgt) {
		EntityManager em = createEM();
		try {
			methodDgt.accept(em);
			return true;
		} catch (Exception ex) {
			ex.printStackTrace();
			return false;
		} finally {
			em.close();
		}
	}

	/**
	 * 事物处理
	 * @param methodDgt
	 */
	public static Boolean ExecTran(Consumer<EntityManager> methodDgt) {
		EntityManager em = createEM();
		EntityTransaction et = em.getTransaction();
		try {
			methodDgt.accept(em);
			et.commit();
			return true;
		} catch (Exception ex) {
			et.rollback();
			return false;
		} finally {
			em.close();
		}
	}
}
