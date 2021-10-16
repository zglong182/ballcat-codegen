package com.hccake.ballcat.codegen.service;

import com.hccake.ballcat.codegen.model.dto.GeneratorOptionDTO;
import com.hccake.ballcat.codegen.model.vo.TemplateEntryTree;

import java.io.IOException;
import java.util.List;

/**
 * @author hccake
 * @date 2018/7/29
 */
public interface GeneratorService {

	/**
	 * 生成代码
	 * @param generatorOptionDTO 代码生成的一些参数
	 * @return 已生成的代码数据
	 */
	byte[] generatorCode(GeneratorOptionDTO generatorOptionDTO) throws IOException;

	/**
	 * 预览代码
	 * @param preGenerateOptionDTO {@code preGenerateOptionDTO}
	 * @return {@code Map<String, String>}
	 */
	List<TemplateEntryTree> previewCode(GeneratorOptionDTO preGenerateOptionDTO);

}
