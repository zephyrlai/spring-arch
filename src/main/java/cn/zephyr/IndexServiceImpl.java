package cn.zephyr;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @ClassName: IndexServiceImpl
 * @Author: laizonghao
 * @Description:
 * @Date: 2020/2/5 15:06
 */
@Data
@Service("indexService")
public class IndexServiceImpl implements IndexService {
    @Resource
    private IndexDao indexDao;

    private String injectedString;

    public void indexServiceFunc() {
        System.err.println("This is indexService function.");
        System.err.println("This is injectedString: " + injectedString);
        indexDao.indexDaoFunc();
    }
}
