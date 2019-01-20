import liquibase.change.custom.CustomChange;
import liquibase.change.custom.CustomTaskChange;
import liquibase.database.Database;
import liquibase.exception.CustomChangeException;
import liquibase.exception.SetupException;
import liquibase.exception.ValidationErrors;
import liquibase.resource.ResourceAccessor;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Getter
@Setter
@Slf4j
public class MyCustomChange implements CustomTaskChange {
    private String testValue;

    @Override
    public void setUp() throws SetupException {
        LOG.info("testValue = {}", testValue);
    }

    @Override
    public void execute(Database database) throws CustomChangeException {

    }

    @Override
    public ValidationErrors validate(Database database) {
        return null;
    }

    @Override
    public void setFileOpener(ResourceAccessor resourceAccessor) {

    }

    @Override
    public String getConfirmationMessage() {
        return null;
    }
}
