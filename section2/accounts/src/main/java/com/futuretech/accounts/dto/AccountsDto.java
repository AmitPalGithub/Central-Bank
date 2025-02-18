package com.futuretech.accounts.dto;


import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
@Schema(
        name =  "Accounts",
        description = "Schema to hold the Account Information"
)
public class AccountsDto {


    @NotEmpty(message = "Account number can not be a null or empty")
    @Pattern(regexp = "(^$|[0-9]{10})", message = "Account number must be 10 digits")
    @Schema(
            description = "Account Number of Central Bank account", example = "982116434"
    )
    private Long accountNumber;


    @NotEmpty(message = "Account type can not be null or empty")
    @Schema(
            description = "Account type of Central Bank", example = "Savings"
    )
    private String accountType;


    @NotEmpty(message = "BranchAddress can not be null or empty")
    @Schema(
            description = "Branch Address of Central Bank", example = "43, Down Street, New York"
    )
    private String branchAddress;
}
