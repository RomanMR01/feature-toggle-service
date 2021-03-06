package com.epam.feature.toggle.data;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@DynamoDBTable(tableName = "toggle")
@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
public class FeatureToggle {

    @DynamoDBHashKey
    private String code;

    @DynamoDBAttribute
    private boolean enabled;
}
