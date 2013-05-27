package com.soebes.casestudy;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.apache.log4j.Logger;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.soebes.casestudy.bo.EntriesBO;
import com.soebes.casestudy.dao.DAOFactory;
import com.soebes.casestudy.dao.IdDAO;

public class BestellungBOTest extends BOTestBase {
    private static Logger LOGGER = Logger.getLogger(BestellungBOTest.class);

    @BeforeClass
    public void beforeClass() {
        LOGGER.debug("beforeClass()");

        LOGGER.debug("beforeClass(done)");
    }

    @Test(enabled = true)
    public void testGet() {
        IdDAO<EntriesBO> dao = DAOFactory.getBestellung();
        List<EntriesBO> resultList = dao.get();
        assertEquals(resultList.size(), 1);
        LOGGER.info("Entries:" + resultList.get(0).getId());
    }


}
