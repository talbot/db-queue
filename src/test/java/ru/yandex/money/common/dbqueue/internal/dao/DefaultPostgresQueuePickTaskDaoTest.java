package ru.yandex.money.common.dbqueue.internal.dao;

import org.junit.BeforeClass;

import ru.yandex.money.common.dbqueue.dao.BaseDaoTest;
import ru.yandex.money.common.dbqueue.utils.QueueDatabaseInitializer;

/**
 * @author Oleg Kandaurov
 * @since 12.10.2019
 */
public class DefaultPostgresQueuePickTaskDaoTest extends PostgresQueuePickTaskDaoTest {

    @BeforeClass
    public static void beforeClass() {
        QueueDatabaseInitializer.databaseType = QueueDatabaseInitializer.DatabaseType.PG;
        BaseDaoTest.beforeClass();
    }

    public DefaultPostgresQueuePickTaskDaoTest() {
        super(TableSchemaType.PG_DEFAULT);
    }
}
