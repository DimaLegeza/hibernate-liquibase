#!/bin/bash

/opt/mssql-tools/bin/sqlcmd -S database -U SA -P 'FakePass51&' -Q "CREATE DATABASE hibernateliquibase"