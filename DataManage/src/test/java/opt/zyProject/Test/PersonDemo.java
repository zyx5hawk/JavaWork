package opt.zyProject.Test;

import org.junit.Test;
import opt.zyProject.dao.PersonDao;
import opt.zyProject.domain.Person;
import opt.zyProject.utils.JpaUtils;

public class PersonDemo  {

	@Test
	public void find() {
		new PersonDao().Search();
	}
	
	@Test
	public void Save() {
		Person p=new Person();
		p.setName("赵迎新");
		
		JpaUtils.ExecTran(em->{
			em.persist(p);
		});
	}
}
