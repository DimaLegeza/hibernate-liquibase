FROM ubuntu:16.04
MAINTAINER Dmytro Legeza <dmytro.legeza@powerhouse.nl>

ENV ACCEPT_EULA=Y

RUN locale-gen "en_US.UTF-8"
ENV LANG en_US.UTF-8
ENV LANGUAGE en_US:en
ENV LC_ALL en_US.UTF-8

RUN apt-get -qq -y update && \
    apt-get -qq -y install apt-transport-https locales curl && \
	apt-get -qq -y --purge autoremove && \
	apt-get -qq -y autoclean && \
	rm -rf /var/lib/apt/lists/* /tmp/* /var/tmp/*

RUN curl https://packages.microsoft.com/keys/microsoft.asc | apt-key add -

RUN curl https://packages.microsoft.com/config/ubuntu/16.04/prod.list | tee /etc/apt/sources.list.d/msprod.list

RUN apt-get -qq update && \
    apt-get -qq -y install mssql-tools && \
	apt-get -qq -y --purge autoremove && \
    apt-get -qq -y autoclean && \
    rm -rf /var/lib/apt/lists/* /tmp/* /var/tmp/*

RUN ln -s /opt/mssql-tools/bin/sqlcmd /usr/bin/sqlcmd

COPY wait-for-it.sh createdb.sh /bin/

RUN chmod 750 /bin/wait-for-it.sh
RUN chmod 750 /bin/createdb.sh