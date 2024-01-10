package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zsy.web.mapper.GeneratorMapper;
import com.zsy.web.model.entity.Generator;
import generator.service.GeneratorService;
import org.springframework.stereotype.Service;

/**
 * @author 12402
 * @description 针对表【generator(代码生成器)】的数据库操作Service实现
 * @createDate 2024-01-06 16:01:23
 */
@Service
public class GeneratorServiceImpl extends ServiceImpl<GeneratorMapper, Generator>
        implements GeneratorService {

}




