package com.client.core.dlmtasks.service.impl.paybill;

import com.bullhornsdk.data.model.entity.core.paybill.charge.PayExportBatch;
import com.client.core.dlmtasks.service.QueryDateLastModifiedTasksService;
import com.client.core.dlmtasks.workflow.node.DateLastModifiedEventTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PayExportBatchDateLastModifiedTasksService extends QueryDateLastModifiedTasksService<PayExportBatch> {

    @Autowired
    public PayExportBatchDateLastModifiedTasksService(Optional<List<DateLastModifiedEventTask<PayExportBatch>>> dateLastModifiedEventTasks) {
        super(dateLastModifiedEventTasks, PayExportBatch.class);
    }

}
