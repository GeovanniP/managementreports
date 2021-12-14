package com.cs673.practicemanagementreports.reconciliationsheetservice.controller;

import com.cs673.practicemanagementreports.reconciliationsheetservice.beans.ReconciliationSheetList;
import com.cs673.practicemanagementreports.reconciliationsheetservice.service.ReconciliationSheetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

@RestController
@RequestMapping("/practice-management-reports/reconciliation-sheet")
public class ReconciliationSheetController {

    @Autowired
    private ReconciliationSheetService service;

    @GetMapping("/{date}")
    public ResponseEntity<ReconciliationSheetList> generateReconciliationSheetReport(@PathVariable("date") String date){
        if(null!=date && !date.isEmpty()) {
            /*SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
            java.util.Date date1 = null;
            try {
                date1 = sdf.parse(date);
            } catch (ParseException e) {
                e.printStackTrace();
            }

            java.sql.Date sqlDate = new Date(date1.getTime());

            System.out.println("String converted to java.sql.Date :" + sqlDate);*/
            return new ResponseEntity<ReconciliationSheetList>(service.generateReconciliationSheet(date), HttpStatus.OK);
        }
        else
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }
}
