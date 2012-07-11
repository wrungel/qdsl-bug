package a;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;




@MappedSuperclass
public abstract class ABase
{
	@Id
	private Long id;

	private TenantImpl tenant;

	public Long getId() {return id;}

	protected void setId(Long id) {
		this.id = id;
	}

	public Tenant getTenant() {
		return tenant;
	}

	public void setTenant(Tenant tenant) {}
}

