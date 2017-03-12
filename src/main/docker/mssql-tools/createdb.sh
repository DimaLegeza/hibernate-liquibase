#!/bin/bash

/opt/mssql-tools/bin/sqlcmd -S database -U SA -P 'FakePass54321&' -Q "CREATE DATABASE hibernate-liquibase"