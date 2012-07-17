/*
 * JBoss, Home of Professional Open Source
 * Copyright 2011, Red Hat, Inc., and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.jboss.stack;

import java.util.ArrayList;
import java.util.List;

public class Bom
{

   private String name;

   private String description;

   private String groupId = "org.jboss.bom";

   private String artifactId;

   private String recommendedVersion;

   private List<String> availableVersions = new ArrayList<String>();

   private List<String> labels = new ArrayList<String>();

   public String getName()
   {
      return name;
   }

   public void setName(String name)
   {
      this.name = name;
   }

   public String getDescription()
   {
      return description;
   }

   public void setDescription(String description)
   {
      this.description = description;
   }

   public String getGroupId()
   {
      return groupId;
   }

   public void setGroupId(String groupId)
   {
      if (groupId != null)
      {
         this.groupId = groupId;
      }
   }

   public String getArtifactId()
   {
      return artifactId;
   }

   public void setArtifactId(String artifactId)
   {
      this.artifactId = artifactId;
   }

   public String getRecommendedVersion()
   {
      return recommendedVersion;
   }

   public void setRecommendedVersion(String recommendedVersion)
   {
      this.recommendedVersion = recommendedVersion;
   }

   public List<String> getAvailableVersions()
   {
      return availableVersions;
   }

   public void setAvailableVersions(List<String> availableVersions)
   {
      this.availableVersions = availableVersions;
   }

   public List<String> getLabels()
   {
      return labels;
   }

   public void setLabels(List<String> labels)
   {
      this.labels = labels;
   }

   @Override
   public String toString()
   {
      return this.getArtifactId();
   }
}
