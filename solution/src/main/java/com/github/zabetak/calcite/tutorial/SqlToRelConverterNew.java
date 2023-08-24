package com.github.zabetak.calcite.tutorial;

import org.apache.calcite.plan.RelOptCluster;
import org.apache.calcite.plan.RelOptTable;
import org.apache.calcite.prepare.Prepare;
import org.apache.calcite.sql.fun.SqlStdOperatorTable;
import org.apache.calcite.sql.validate.SqlValidator;
import org.apache.calcite.sql2rel.SqlNodeToRexConverterImpl;
import org.apache.calcite.sql2rel.SqlRexConvertletTable;
import com.github.zabetak.calcite.tutorial.StandardConvertletTablePlus;
import org.apache.calcite.sql2rel.SqlToRelConverter;
import org.checkerframework.checker.nullness.qual.Nullable;

import static java.util.Objects.requireNonNull;

public class SqlToRelConverterNew extends SqlToRelConverter {

    private final StandardConvertletTablePlus convertletTablePlus;

    public SqlToRelConverterNew(RelOptTable.ViewExpander viewExpander, @Nullable SqlValidator validator, Prepare.CatalogReader catalogReader, RelOptCluster cluster, SqlRexConvertletTable convertletTable,StandardConvertletTablePlus convertletTablePlus, Config config) {
        super(viewExpander,
                validator,
                catalogReader,
                cluster,
                convertletTable,
                config);
        this.convertletTablePlus = convertletTablePlus;
    }


}
