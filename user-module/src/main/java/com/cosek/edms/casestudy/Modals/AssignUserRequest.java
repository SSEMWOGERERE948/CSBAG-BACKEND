package com.cosek.edms.casestudy.Modals;

import lombok.Data;

import java.util.List;

@Data
public class AssignUserRequest {
    private Long caseStudyId;
    private List<Long> userId;
}
