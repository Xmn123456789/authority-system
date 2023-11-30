package com.manong.service;

import com.manong.entity.Department;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author lemon
 * @since 2023-11-26
 */
@Service
@Transactional
public interface DepartmentService extends IService<Department> {

}
