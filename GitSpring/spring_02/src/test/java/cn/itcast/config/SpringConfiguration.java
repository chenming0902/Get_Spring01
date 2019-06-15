package cn.itcast.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;

@Configuration

@ComponentScan("cn.itcast")
@Import({DatasourceConfiguration.class})
public class SpringConfiguration {




}
