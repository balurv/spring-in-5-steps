package componentscan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class ComponentDao {

	@Autowired
	JdbcComponentConnection jdbcConnection;

	public JdbcComponentConnection getJdbcConnection() {
		return jdbcConnection;
	}

	public void setJdbcConnection(JdbcComponentConnection jdbcConnection) {
		this.jdbcConnection = jdbcConnection;
	}

}
