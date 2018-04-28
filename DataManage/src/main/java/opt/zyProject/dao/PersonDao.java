package opt.zyProject.dao;

import opt.zyProject.domain.Person;
import opt.zyProject.utils.JpaUtils;

public class PersonDao {

	public void Search() {
		JpaUtils.ExecUnTran(em->{
			Person p=em.find(Person.class, 2);
			System.out.println(p.getName());
		});
	}
}
